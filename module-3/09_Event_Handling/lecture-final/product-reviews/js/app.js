const bookName = 'Cigar Parties for Dummies';
let description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
let reviews = [
  {
    reviewer: 'Malcolm Madwell',
    title: 'What a book!',
    review:
    "It certainly is a book. I mean, I can see that. Pages kept together with glue and there's writing on it, in some language. Yes indeed, it is a book!",
    rating: 3
  }
];

/**
 * Add product name to the page title.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('page-title');
  pageTitle.querySelector('.name').innerText = bookName;
}

/**
 * Add product description to the page.
 */
function setPageDescription() {
  document.querySelector('.description').innerText = description;
}

/**
 * Display all of the reviews in the reviews array.
 */
function displayReviews() {
  if ('content' in document.createElement('template')) {
    reviews.forEach((review) => {
      displayReview(review);
    });
  } else {
    console.error('Your browser does not support templates');
  }
}

/**
 * Add single review to the page.
 *
 * @param {Object} review The review to display
 */
function displayReview(review) {
  const main = document.getElementById('main');
  const tmpl = document.getElementById('review-template').content.cloneNode(true);
  tmpl.querySelector('h4').innerText = review.reviewer;
  tmpl.querySelector('h3').innerText = review.title;
  tmpl.querySelector('p').innerText = review.review;
  // there will always be 1 star because it is a part of the template
  for (let i = 1; i < review.rating; ++i) {
    const img = tmpl.querySelector('img').cloneNode();
    tmpl.querySelector('.rating').appendChild(img);
  }
  main.appendChild(tmpl);
}

// LECTURE STARTS HERE ---------------------------------------------------------------
//add an event listener to the DOM itself to wait until all the content is loaded
document.addEventListener('DOMContentLoaded', () => {

  // Set the product reviews page title.
  setPageTitle();
  // Set the product reviews page description.
  setPageDescription();
  // Display all of the product reviews on our page.
  displayReviews();

  const descriptionElement = document.querySelector('.description');
  //take the event object, and get the target (the element that has caused the event - the <p> for the book description), and pass it to toggleDescriptionEdit 
  descriptionElement.addEventListener('click', (event) => {
    toggleDescriptionEdit(event.target);
  });

  const descriptionInputElement = document.getElementById('inputDesc');
  descriptionInputElement.addEventListener('keyup', (event) => {
    //console.log(event.key); 

    if(event.key === 'Enter') { 
      exitDescriptionEdit(event.target, true);
    }

    if(event.key === 'Escape') { 
      exitDescriptionEdit(event.target, false); 
    }
  })

  const addReviewButton = document.getElementById('btnToggleForm'); 
  //let's write this listener with just a function reference since we don't need the event object and there are no parameters
  addReviewButton.addEventListener('click', showHideForm );

  const saveReviewButton = document.getElementById('btnSaveReview');
  //a submit button has default browser behavior for when it's clicked, so we're going to stop that from happening with .preventDefault()
  saveReviewButton.addEventListener('click', (event) => {
    event.preventDefault();
    saveReview();
  });

});


/**
 * Hide the description and show the text box.
 *
 * @param {Element} desc the element containing the description
 */
function toggleDescriptionEdit(desc) {
  //use the <p> (desc) to find the hidden input (textBox)
  const textBox = desc.nextElementSibling;
  //set the value of the text box to the text of the description <p>
  textBox.value = desc.innerText;
  //take the d-none class off the text box so that it shows up in the UI
  textBox.classList.remove('d-none');
  //put the d-none class on the desc <p> so that it doesn't show up in the UI
  desc.classList.add('d-none');
  //put the cursor in the text box for typing
  textBox.focus();
}

/**
 * Hide the text box and show the description.
 * If save is true, also set the description to the contents of the text box.
 *
 * @param {Element} textBox the input element containing the edited description
 * @param {Boolean} save should we save the description text
 */
function exitDescriptionEdit(textBox, save) {
  //look at the previous element to find the <p> tag
  let desc = textBox.previousElementSibling;
  if (save) {
    desc.innerText = textBox.value;
  }
  textBox.classList.add('d-none');
  desc.classList.remove('d-none');
}

/**
 * Toggle visibility of the add review form.
 */
function showHideForm() {
  const form = document.querySelector('form');
  const btn = document.getElementById('btnToggleForm');

  if (form.classList.contains('d-none')) {
    form.classList.remove('d-none');
    btn.innerText = 'Hide Form';
    document.getElementById('name').focus();
  } else {
    resetFormValues();
    form.classList.add('d-none');
    btn.innerText = 'Add Review';
  }
}

/**
 * Reset all of the values in the form.
 */
function resetFormValues() {
  const form = document.querySelector('form');
  const inputs = form.querySelectorAll('input');
  inputs.forEach((input) => {
    input.value = '';
  });
  document.getElementById('rating').value = 1;
  document.getElementById('review').value = '';
}

/**
 * Save the review that was added using the add review form.
 */
function saveReview() {
  //reference all the form fields 
  const inputName = document.getElementById('name');
  const inputTitle = document.getElementById('title');
  const inputRating = document.getElementById('rating');
  const inputReview = document.getElementById('review');

  //build a new review object using the values from the form fields
  
  let newReview = {
    reviewer: inputName.value,
    title: inputTitle.value,
    review: inputReview.value,
    rating: inputRating.value
  }

  //call the displayReview function with the new review
  displayReview(newReview);

}

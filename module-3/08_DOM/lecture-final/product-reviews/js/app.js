const bookName = 'Cigar Parties for Dummies';
const description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
const reviews = [
  {
    reviewer: 'Malcolm Madwell',
    title: 'What a book!',
    review:
    "It certainly is a book. I mean, I can see that. Pages kept together with glue and there's writing on it, in some language. Yes indeed, it is a book!",
    rating: 3
  },
  {
    reviewer: 'Tim Ferriss',
    title: 'Had a cigar party started in less than 4 hours.',
    review:
      "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
    rating: 4
  },
  {
    reviewer: 'Ramit Sethi',
    title: 'What every new entrepreneurs needs. A door stop.',
    review:
      "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
    rating: 1
  },
  {
    reviewer: 'Gary Vaynerchuk',
    title: 'And I thought I could write',
    review:
      "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
    rating: 3
  }
];

/**
 * Add the product name to the page title
 * Get the page title by the id and the query the .name selector
 * once you have the element you can add the product name to the span.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('page-title');
  const span = pageTitle.querySelector('.name');
  span.innerText = bookName;
}

/**
 * Add the product description to the page.
 */
function setPageDescription() {
  const paragraph = document.querySelector('.description');
  paragraph.innerText = description;
}

/**
 * Display all of the reviews on the page.
 * Loop over the array of reviews and use some helper functions
 * to create the elements needed for the markup and add them to the DOM.
 */
function displayReviews() {
  const mainContainer = document.getElementById('main'); 

  reviews.forEach((review) => {
    const reviewContainer = document.createElement('div');
    reviewContainer.classList.add('review');

    //call the addReviewer function to put the review name in the box
    addReviewer(reviewContainer, review.reviewer);

    //call the addRating function to put the stars in the box
    addRating(reviewContainer, review.rating);

    //call the addTitle function to put the title in the box 
    addTitle(reviewContainer, review.title);

    //call the addReview function to put the review text in the box 
    addReview(reviewContainer, review.review);

    //put the box in the DOM
    mainContainer.insertAdjacentElement('beforeend', reviewContainer);
  })


}

/**
 * Create a new h2 element with the name of the reviewer and append it to
 * the parent element that is passed to me.
 *
 * @param {HTMLElement} parent: The element to append the reviewer to
 * @param {string} name The name of the reviewer
 */
function addReviewer(parent, name) {
  const reviewerName = document.createElement('h2'); 
  reviewerName.innerText = name;
  parent.appendChild(reviewerName);

}

/**
 * Add the rating div along with a star image for the number of ratings 1-5
 * @param {HTMLElement} parent
 * @param {Number} numberOfStars
 */
function addRating(parent, numberOfStars) {
  const ratingBox = document.createElement('div'); 
  ratingBox.classList.add('rating'); 

  for(let i = 0; i < numberOfStars; i++){
    const image = document.createElement('img'); 
    image.setAttribute('src', 'img/star.png');
  
    ratingBox.appendChild(image); 
  }

  parent.appendChild(ratingBox); 
}

/**
 * Add an h3 element along with the review title
 * @param {HTMLElement} parent
 * @param {string} title
 */
function addTitle(parent, title) {
  const titleHeader = document.createElement('h3'); 
  titleHeader.innerText = title; 
  parent.appendChild(titleHeader);

}

/**
 * Add the product review
 * @param {HTMLElement} parent
 * @param {string} review
 */
function addReview(parent, review) {
  const reviewParagraph = document.createElement('p'); 
  reviewParagraph.innerText = review; 
  parent.appendChild(reviewParagraph); 

}

// set the product reviews page title
setPageTitle();
// set the product reviews page description
setPageDescription();
// display all of the product reviews on the page
displayReviews();

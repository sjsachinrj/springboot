package ca.homedepot.customerreview.service.impl;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import ca.homedepot.customerreview.dao.CustomerReviewDao;
import ca.homedepot.customerreview.model.CustomerReviewModel;
import ca.homedepot.customerreview.model.LanguageModel;
import ca.homedepot.customerreview.model.ProductModel;
import ca.homedepot.customerreview.model.UserModel;
import ca.homedepot.customerreview.service.CustomerReviewService;

@Component
@Profile("with-validation")
public class ValidatorCustomerReviewServiceImpl extends DefaultCustomerReviewService {

	public ValidatorCustomerReviewServiceImpl(
			CustomerReviewDao customerReviewDao) {
		super(customerReviewDao);
		// TODO Auto-generated constructor stub
	}
	@Override
	public CustomerReviewModel createCustomerReview(Double rating,
			String headline, String comment, ProductModel product,
			UserModel user) {
		final CustomerReviewModel review = new CustomerReviewModel();
		review.setRating(rating);
		review.setHeadline(headline);
		review.setComment(comment);
		review.setProduct(product);
		review.setUser(user);
		customerReviewDao.save(review);
		return review;
	}

	
}

package com.crossover.techtrial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crossover.techtrial.model.Comment;
import com.crossover.techtrial.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

  @Autowired
  CommentRepository commentRepository;

  /*
   * Returns all the Comments related to article along with Pagination information.
   */
  public List<Comment> findAll(Long articleId) {
    return commentRepository.findAll();
  }

  /*
   * Save the default article.
   */
  public Comment save(Comment comment) {
    return commentRepository.save(comment);
  }

  @Override
  public Comment findById(Long id) {
	return commentRepository.findById(id).orElse(null);
  }

  @Override
  public void delete(Long id) {
	  commentRepository.deleteById(id);
  }

@Override
public Comment findByIdWithRealtions(Long commentId) {
	return commentRepository.findByIdWithRealtions(commentId);
}

  
  
}

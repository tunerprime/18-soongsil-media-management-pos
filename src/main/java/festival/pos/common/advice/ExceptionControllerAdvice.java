package festival.pos.common.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(ApiException.class)
	public BodyBuilder apiExecption(ApiException e) {
		return ResponseEntity.status(e.getHttpStatus());
	}
}

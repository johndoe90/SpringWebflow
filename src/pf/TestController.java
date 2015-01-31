package pf;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "test")
public class TestController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Void> test() {
		return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
	}
}

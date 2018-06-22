package sandeep;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	private static String chars = "abcdefjhigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.,'\";:/\\!-_)(*&^%$#`~+=[]{}";
	public String random() {
	String result = "";
	String[] chs = chars.split("");

	int random;
	for(int i = 0; i < 10; i++) {
		random = (int)(Math.random() * (chars.length()));
		result += chs[random];
	}
	
	return result;
	}
	 @RequestMapping(value = "welcome",
			    method = RequestMethod.GET)
	 public String functionNameDoesntMatter()
	 {
		 return "Welcome";
	 }
	@GetMapping("welcomeuser")
	 public String WelcomeUser()
	 {
		 return "welcome "+random();
	 }

}

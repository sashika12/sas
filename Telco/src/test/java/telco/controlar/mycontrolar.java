package telco.controlar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class mycontrolar {
	
	@GetMapping("/test")
	public String Name()
	{
		return "Sashika Himaruwan";
	}
}

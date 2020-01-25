package weljak.oauth2poc.webapi;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HomeController {
    @GetMapping("/{person}")
    public String getIndex(@AuthenticationPrincipal Authentication authentication, @PathVariable(required = false) String person) {
        System.out.println(authentication);
        String possiblePerson = person != null ? person : "unknown person";
        return String.format("hello %s", possiblePerson);
    }

}

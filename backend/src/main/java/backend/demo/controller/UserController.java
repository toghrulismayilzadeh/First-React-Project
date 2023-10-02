package backend.demo.controller;

import backend.demo.model.dto.UserDto;
import backend.demo.model.entity.User;
import backend.demo.serivce.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/app/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping
    public String save(@RequestBody UserDto dto){
        service.save(dto);
        return "Created";
    }
    @GetMapping
    public List<UserDto> findall(){
        return service.findAll();
    }
}

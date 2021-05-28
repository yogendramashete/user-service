package poc.yogendra.user.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import poc.yogendra.user.entity.User
import poc.yogendra.user.service.UserService
import poc.yogendra.user.vo.ResponseTemplate

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @PostMapping("/")
    fun saveUser(@RequestBody user:User):User{
        return userService.saveUser(user)
    }

    @GetMapping("/{id}")
    fun getUserWithDepartment(@PathVariable id:Long):ResponseTemplate = userService.getRestTemplateVO(id)
}
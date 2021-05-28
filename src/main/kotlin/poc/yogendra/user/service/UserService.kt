package poc.yogendra.user.service

import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import poc.yogendra.user.entity.User
import poc.yogendra.user.repository.UserRepository
import poc.yogendra.user.vo.Department
import poc.yogendra.user.vo.ResponseTemplate

@Service
class UserService {
    private val log = KotlinLogging.logger {}

    @Autowired
    lateinit var userRepository: UserRepository

    @Autowired
    lateinit var restTemplate: RestTemplate

    fun saveUser(user: User): User {
        log.info("Inside saveUser of UserService")
        return userRepository.save(user)
    }

    fun getRestTemplateVO(departmentId: Long): ResponseTemplate {
        log.info("Inside getDepartment of UserService")
        val user = userRepository.findById(departmentId).get()
        val department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/$departmentId", Department::class.java)
        return ResponseTemplate(user, department!!)
    }
}
package poc.yogendra.user.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import poc.yogendra.user.entity.User

@Repository
interface UserRepository: JpaRepository<User, Long> {
}
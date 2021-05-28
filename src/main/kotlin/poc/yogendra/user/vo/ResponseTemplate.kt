package poc.yogendra.user.vo

import poc.yogendra.user.entity.User

data class ResponseTemplate(
    val user: User,
    val department: Department
)
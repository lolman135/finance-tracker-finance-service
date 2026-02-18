package tracker.financeservice.domain.category

import java.util.UUID

data class Category(val id: UUID, val name: String) {

    fun rename(newName: String): Category{
        require(newName.isNotBlank()){"Name cannot be blank"}
        return copy(name = newName)
    }
}
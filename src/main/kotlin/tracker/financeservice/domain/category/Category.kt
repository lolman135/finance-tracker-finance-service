package tracker.financeservice.domain.category

import tracker.financeservice.domain.transaction.TransactionType
import java.util.UUID

data class Category(
    val id: UUID,
    val name: String,
    val userId: UUID?,
    val type: TransactionType
) {

    fun rename(newName: String): Category{
        require(newName.isNotBlank()){"Name cannot be blank"}
        return copy(name = newName)
    }
}
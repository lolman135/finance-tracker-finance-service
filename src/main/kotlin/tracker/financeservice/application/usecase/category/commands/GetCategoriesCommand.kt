package tracker.financeservice.application.usecase.category.commands

import tracker.financeservice.domain.transaction.TransactionType
import java.util.UUID

data class GetCategoriesCommand(
    val userId: UUID? = null,
    val type: TransactionType?,
    val pageAmount: Int,
    val size: Int
)
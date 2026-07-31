package tracker.financeservice.domain.category

import tracker.financeservice.domain.BaseDomainRepository
import tracker.financeservice.domain.PageRequest
import tracker.financeservice.domain.PageResponse
import tracker.financeservice.domain.transaction.TransactionType
import java.util.UUID

interface CategoryRepository : BaseDomainRepository<UUID, Category> {
    fun findByName(name: String): Category?
    fun existsByName(name: String): Boolean
    fun findAllByType(request: PageRequest, userId: UUID? = null, type: TransactionType): PageResponse<Category>
}
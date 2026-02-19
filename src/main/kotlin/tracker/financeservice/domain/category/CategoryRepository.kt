package tracker.financeservice.domain.category

import tracker.financeservice.domain.BaseDomainRepository
import java.util.UUID

interface CategoryRepository : BaseDomainRepository<UUID, Category> {
    fun findByName(name: String): Category?
}
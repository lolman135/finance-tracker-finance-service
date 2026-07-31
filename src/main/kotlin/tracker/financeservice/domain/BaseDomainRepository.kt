package tracker.financeservice.domain

import java.util.UUID

interface BaseDomainRepository<ID, T> {
    fun save(domain: T): T
    fun findById(id: ID): T?
    fun deleteById(id: ID)
    fun findAllByPages(request: PageRequest, userId: UUID? = null): PageResponse<T>
}
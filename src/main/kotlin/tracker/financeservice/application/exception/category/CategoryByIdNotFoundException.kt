package tracker.financeservice.application.exception.category

import tracker.financeservice.application.exception.DomainNotFoundException
import java.util.UUID

class CategoryByIdNotFoundException(val id: UUID) : DomainNotFoundException("Category by $id not found")
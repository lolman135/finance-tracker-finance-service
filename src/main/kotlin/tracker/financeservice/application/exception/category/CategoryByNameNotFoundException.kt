package tracker.financeservice.application.exception.category

import tracker.financeservice.application.exception.DomainNotFoundException

class CategoryByNameNotFoundException(val name: String) : DomainNotFoundException("Category $name not found")
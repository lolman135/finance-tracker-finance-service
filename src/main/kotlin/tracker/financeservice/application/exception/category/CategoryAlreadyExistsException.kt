package tracker.financeservice.application.exception.category

import tracker.financeservice.application.exception.DomainAlreadyExistsException

class CategoryAlreadyExistsException : DomainAlreadyExistsException("This category already exists")
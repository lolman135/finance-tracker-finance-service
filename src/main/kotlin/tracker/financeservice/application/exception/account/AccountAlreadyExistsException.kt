package tracker.financeservice.application.exception.account

import tracker.financeservice.application.exception.DomainAlreadyExistsException

class AccountAlreadyExistsException() : DomainAlreadyExistsException("Account with this name is already exists")
package tracker.financeservice.application.exception.account

import tracker.financeservice.application.exception.DomainNotFoundException

class AccountByNameNotFoundException(val name: String) : DomainNotFoundException("Account $name not found")
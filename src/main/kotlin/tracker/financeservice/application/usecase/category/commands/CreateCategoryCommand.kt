package tracker.financeservice.application.usecase.category.commands

import java.util.UUID

data class CreateCategoryCommand(val name: String, val userId: UUID?, val type: String)
package tracker.financeservice.application.usecase.category.commands

import java.util.UUID

class UpdateCategoryCommand(
    val id: UUID,
    val name: String,
) {
}
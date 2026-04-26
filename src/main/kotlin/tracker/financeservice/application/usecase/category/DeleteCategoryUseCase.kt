package tracker.financeservice.application.usecase.category

import org.springframework.stereotype.Service
import tracker.financeservice.application.usecase.UseCase
import tracker.financeservice.domain.category.CategoryRepository
import java.util.UUID

//@Service
//TODO: uncomment after creating components
class DeleteCategoryUseCase(private val categoryRepository: CategoryRepository) : UseCase<UUID, Unit>{

    override fun execute(id: UUID) {
        categoryRepository.deleteById(id)
    }
}
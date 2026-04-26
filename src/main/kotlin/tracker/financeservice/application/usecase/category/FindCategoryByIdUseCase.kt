package tracker.financeservice.application.usecase.category

import tracker.financeservice.application.exception.category.CategoryByIdNotFoundException
import tracker.financeservice.application.usecase.UseCase
import tracker.financeservice.domain.category.Category
import tracker.financeservice.domain.category.CategoryRepository
import java.util.UUID

//@Service
//TODO: uncomment after creating components
class FindCategoryByIdUseCase(private val categoryRepository: CategoryRepository) : UseCase<UUID, Category>{

    override fun execute(id: UUID) = categoryRepository.findById(id) ?: throw CategoryByIdNotFoundException(id)
}
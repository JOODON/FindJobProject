package com.example.findjobproject.Controller
import com.example.findjobproject.entitty.Category.MainCategory
import com.example.findjobproject.entitty.Category.MajorCategory
import com.example.findjobproject.entitty.Category.SubCategory
import com.example.findjobproject.service.MainCategoryService
import com.example.findjobproject.service.MajorCategoryService
import com.example.findjobproject.service.SubCategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
class CategoryController(
    @Autowired
    private val mainCategoryService: MainCategoryService,
    private val majorCategoryService: MajorCategoryService ,
    private val subCategoryService: SubCategoryService
) {
    @GetMapping("/mainCategories")
    fun getAllMainCategories() : List<MainCategory>{
        return mainCategoryService.findAllMainCategory()
    }

    @GetMapping("/majorCategories")
    fun getAllMajorCategories() : List<MajorCategory> {
        return majorCategoryService.findAllMajorCategory()
    }
    @GetMapping("/subCategories")
    fun getAllSubCategories() : List<SubCategory> {
        return subCategoryService.findAllSubCategory()
    }

}
package com.example.findjobproject.data

import com.example.findjobproject.entitty.CarrerAttibutes.Career
import com.example.findjobproject.entitty.CarrerAttibutes.EducationLevel
import com.example.findjobproject.entitty.Category.SubCategory
import com.example.findjobproject.entitty.Company
import com.example.findjobproject.entitty.Satisfy
import java.time.LocalDate

val satisfyList : List<Satisfy> = listOf(

    Satisfy(
        1,
        Career.FRESH,
        EducationLevel.COLLEGE,
        listOf("종자 판매 영업","고객관리"),
        listOf("컴퓨터 활용 능력","농업기사"),
    ),

    Satisfy(
        2,
        Career.FRESH,
        EducationLevel.COLLEGE,
        listOf("종자 판매 영업","제조업"),
        listOf("컴퓨터 활용 능력","농업기사"),
    )


)

val companyList : List<Company> = listOf(
    Company(
        SubCategory(1, "작물 재배업", MajorCategoryList[0]),
        1,
        "아시아종묘 도시농업본부 도시농업팀 채용 – 농업회사법인아시아종묘(주)",
        "서울 송파구 가락동",
        LocalDate.now().minusDays(2),
        satisfyList[0]
    ),

)

// Satisfy 엔터티 생성

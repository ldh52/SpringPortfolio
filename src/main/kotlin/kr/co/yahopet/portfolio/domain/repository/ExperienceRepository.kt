package kr.co.yahopet.portfolio.domain.repository

import kr.co.yahopet.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long>
package kr.co.yahopet.portfolio.domain.repository

import kr.co.yahopet.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>
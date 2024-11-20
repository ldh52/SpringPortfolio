package kr.co.yahopet.portfolio.domain.repository

import kr.co.yahopet.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>
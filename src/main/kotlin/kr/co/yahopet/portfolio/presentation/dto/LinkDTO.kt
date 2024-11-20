package kr.co.yahopet.portfolio.presentation.dto

import kr.co.yahopet.portfolio.domain.entity.Link

class LinkDTO(
    val name: String,
    val content: String
) {
    constructor(link: Link) : this(
        name = link.name.lowercase(),
        content = link.content
    )
}
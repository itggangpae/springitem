package com.adamsoft.item.service;

import java.util.List;

import com.adamsoft.item.domain.ItemDTO;

public interface ItemService {
	//테이블의 전체 데이터를 가져오는 메서드
	public List<ItemDTO> getAll();
}

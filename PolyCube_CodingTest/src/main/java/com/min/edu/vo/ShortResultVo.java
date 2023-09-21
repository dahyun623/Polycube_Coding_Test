package com.min.edu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ShortResultVo {
	
	private String baseDate   ;
	private String baseTime   ;
	private String category;
	private int nx         ;
	private int ny         ;
	private String obsrValue;
}

package com.min.edu;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.min.edu.service.IMidWeatherService;
import com.min.edu.service.IShortWeatherService;
import com.min.edu.service.IUltraShortWeatherService;
import com.min.edu.vo.MidForecastVo;
import com.min.edu.vo.ShortForecastVo;
import com.min.edu.vo.ShortResultVo;

@Controller
public class HomeController{
	
	@Autowired
	private IMidWeatherService midService;
	
	@Autowired
	private IShortWeatherService shrtService;
	
	@Autowired
	private IUltraShortWeatherService ultrShrtService;
	
	
	
	@GetMapping("/midWeatherView.do")
	public String midWeatherView() {
		return "midWeatherView";
	}

	@GetMapping("/shortWeatherView.do")
	public String shortWeatherView() {
		return "shortWeatherView";
	}

	@GetMapping("/ultraShortWeatherView.do")
	public String ultraShortWeatherView() {
		return "ultraShortWeatherView";
	}
	
	@GetMapping("/midWeatherList.do")
	public String midWeatherList(Model model) {
		List<MidForecastVo> list = midService.getMidList();
		model.addAttribute("list", list);
		model.addAttribute("title", "목록 조회");
		return "midWeatherList";
	}
	
	
	@GetMapping("/shortWeatherList.do")
	public String shortWeatherList(Model model) {
		List<ShortForecastVo> list = shrtService.getAllSaveList();
		model.addAttribute("list", list);
		model.addAttribute("title", "목록 조회");
		return "shortWeatherList";
	}

	@GetMapping("/ultraShortWeatherList.do")
	public String ultraShortWeatherList(Model model) {
		List<ShortForecastVo> list = ultrShrtService.getAllUltShrtList();
		model.addAttribute("list", list);
		model.addAttribute("title", "목록 조회");
		return "ultraShortWeatherList";
	}
	
	@GetMapping("/midWeatherDetail.do")
	public String midWeatherDetail(int seq,Model model) {
		MidForecastVo vo = midService.getMidDetail(seq);
		model.addAttribute("vo", vo);
		model.addAttribute("title", "상세페이지");
		return "midWeatherDetail";
	}
	
	@GetMapping("/shortWeatherDetail.do")
	public String shortWeatherDetail(int seq,Model model) {
		List<ShortForecastVo> detailList = shrtService.getSaveDetail(seq);
		model.addAttribute("detailList", detailList);
		model.addAttribute("title", "상세페이지");
		return "shortWeatherDetail";
	}

	@GetMapping("/ultraShortWeatherDetail.do")
	public String ultraShortWeatherDetail(int seq,Model model) {
		List<ShortForecastVo> detailList = ultrShrtService.getSaveDetail(seq);
		model.addAttribute("detailList", detailList);
		model.addAttribute("title", "상세페이지");
		return "ultraShortWeatherDetail";
	}
	
	@ResponseBody
	@PostMapping("/saveMidWeather.do")
	public void saveMidWeather(@RequestBody List<MidForecastVo> list) {
		for (MidForecastVo vo : list) {
			midService.insertMidWeather(vo);
		}
		midService.insertMidSeq();
	}
	

	@ResponseBody
	@PostMapping("/saveShortWeather.do")
	public void saveShortWeather(@RequestBody List<ShortForecastVo> lists) {
		for (ShortForecastVo vo : lists) {
			shrtService.insertWeather(vo);
		}
		shrtService.insertSeq();
	}
	
	@ResponseBody
	@PostMapping("/saveUltraShortWeather.do")
	public void saveUltraShortWeather(@RequestBody List<ShortForecastVo> lists) {
		for (ShortForecastVo vo : lists) {
			ultrShrtService.insertUltrShrt(vo);
		}
		ultrShrtService.insertSeq();
	}
	
}

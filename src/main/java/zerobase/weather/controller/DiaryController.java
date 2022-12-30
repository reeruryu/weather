package zerobase.weather.controller;

import java.time.LocalDate;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zerobase.weather.service.DiaryService;

@RequiredArgsConstructor
@RestController
public class DiaryController {
	private final DiaryService diaryService;


	@PostMapping("/create.diary")
	void createDiary(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
		@RequestBody String text) {
			diaryService.createDiary(date, text);

	}



}

package zerobase.weather.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Memo {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String text;
}
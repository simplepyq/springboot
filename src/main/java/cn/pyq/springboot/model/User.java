package cn.pyq.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * desc:
 *
 * @author pyq
 * @date 2018/12/03
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private String id;
	private String username;
	private String password;
}

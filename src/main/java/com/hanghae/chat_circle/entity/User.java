package com.hanghae.chat_circle.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "USERS")
@SQLDelete(sql = "UPDATE users SET is_deleted = true WHERE user_id=?")
@Where(clause = "is_deleted=false")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long id;

	@Column(nullable = false,  unique = true)
	private String username;

	@Column(nullable = false,  unique = true)
	private String nickname;

	@Column(nullable = false)
	private String password;

	@Column
	private boolean isDeleted = Boolean.FALSE;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Post> post = new ArrayList<>();

	public User(String username, String nickname, String password) {
		this.username = username;
		this.nickname = nickname;
		this.password = password;
	}

}

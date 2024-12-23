package com.weddio.weddio.dto.responses;

import com.weddio.weddio.models.enums.FamilyFrom;
import com.weddio.weddio.models.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GuestFamilyResponse {
	private Long id;

	private String name;

	private String whatsappNumber;

	private String address;

	private Gender gender;

	private FamilyFrom familyFrom;

	private Long familyId;

	private Long accountId;
}

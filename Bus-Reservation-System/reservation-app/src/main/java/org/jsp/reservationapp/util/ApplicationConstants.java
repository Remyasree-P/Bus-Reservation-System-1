package org.jsp.reservationapp.util;

public interface ApplicationConstants {
	String ADMIN_VERIFY_LINK="/api/admins/active?token=";
	String USER_VERIFY_LINK="/api/users/active?token=";
	String ADMIN_RESET_PASSWORD_LINK="/api/admins/verify-link?token=";
	String USER_RESET_PASSWORD_LINK="/api/users/verify-link?token=";
}

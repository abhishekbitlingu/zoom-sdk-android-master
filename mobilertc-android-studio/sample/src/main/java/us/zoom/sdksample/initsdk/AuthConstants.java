package us.zoom.sdksample.initsdk;

public interface AuthConstants {

	// TODO Change it to your web domain
	public final static String WEB_DOMAIN = "zoom.us";

	// TODO Change it to your APP Key
	public final static String SDK_KEY = "DUID0PUlOHBSSI7ZW6ORoeYkA3COErr37U4R";

	// TODO Change it to your APP Secret
	public final static String SDK_SECRET = "U9vv2FD2qe4Az1NIahBhfqDSVsPNOyv01dWy";

	/**
	 * We recommend that, you can generate jwttoken on your own server instead of hardcore in the code.
	 * We hardcore it here, just to run the demo.
	 *
	 * You can generate a jwttoken on the https://jwt.io/
	 * with this payload:
	 * {
	 *     "appKey": "string", // app key
	 *     "iat": long, // access token issue timestamp
	 *     "exp": long, // access token expire time
	 *     "tokenExp": long // token expire time
	 * }
	 */
	public final static String SDK_JWTTOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOm51bGwsImlzcyI6Ik15MFVKUTlyU1lpWm1Tb1ZYamI2VEEiLCJleHAiOjE1ODkzNTU2NDYsImlhdCI6MTU4ODc1MDc5N30.mvFTtRjXUvCD2iDS-uf2veAK997ctvyufp7sXPWd3ws";

}

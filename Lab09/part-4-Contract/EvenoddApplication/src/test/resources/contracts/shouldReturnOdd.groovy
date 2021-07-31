import org.springframework.cloud.contract.spec.Contract

Contract.make {
	description "should return odd when number input is odd"
	request {
		method GET()
		url("/validate") {
			queryParameters {
				parameter("number1", "1")
				parameter("number2", "1")
			}
		}
	}
	response {
		body("Odd")
		status 200
	}
}
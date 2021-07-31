import org.springframework.cloud.contract.spec.Contract
Contract.make {
	description "should return even when number input is even"
	request{
		method GET()
		url("/validate") {
			queryParameters {
				parameter("number1", "2")
				parameter("number2", "2")
			}
		}
	}
	response {
		body("Even")
		status 200
	}
}
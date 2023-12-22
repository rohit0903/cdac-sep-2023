package com;

@ExtendWith(SpringExtension.class)
class EmployeeControllerTest {

  @Mock
  private EmployeeService employeeService;
  
  private MockMvc mockMvc;

  @InjectMocks
  private EmployeeController employeeController;

  @BeforeEach
  public void init() {
    mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
  }


  @Test
  void testMethodName_InvalidSchema_ThrowsSchemaValidationException() throws Exception {
    // request formation

    doNothing().when(object).method(anyobject);
    doThrow(new Exception..)
            .when(object).validate(any(), anyString(), any(), any());
			
	when(object.method(isNull(), anyString(), any(ObjectMapper.class), any())).thenReturn(request);

    mockMvc.perform(
            post(endpoint).content(convertToJsonString(request)).accept(MediaType.APPLICATION_JSON)
                    .contentType(MediaType.APPLICATION_JSON)
            .andExpect(status().isBadRequest());
			
	mockMvc.perform(
            post(ENDPOINT).content(convertToJsonString(request))
            .andExpect(status().isOk());
			
	assertNotNull(object);
    assertTrue(any condition);
  }


  private String convertToJsonString(Object obj) throws JsonProcessingException {
    final ObjectMapper mapper = new ObjectMapper();
    return mapper.writeValueAsString(obj);
  }

}
---------------------------------------------

# Executable jar
- https://drive.google.com/file/d/1iXFu0d1SV-Be6iGOxmAPmmJqPJhKOT-H/view?usp=drive_link

# API 명세서

|구분|API 명|HTTP method|API Path|설명|
|------|---|---|---|---|
|생성|설문조사 생성|Post|/survey/register|설문조사를 생성하는 API|
|수정|설문조사 수정|Post|/survey/update|설문조사를 수정하는 API|
|생성|설문조사 응답 제출|Post|/survey/reply|설문조사 응답을 제출하는 API|
|조회|설문조사 응답 조회|Post|/survey/find/replyAll|설문조사 ID를 기반으로 응답을 조회하는 API|
|조회|설문조사 조회|Post|/survey/find|설문조사 ID를 기반으로 설문조사를 조회하는 API|
|조회|설문조사 전체 조회|Get|/survey/find/baseAll|설문조사 전체 목록을 조회하는 API|
|삭제|설문조사 삭제|Post|/survey/delete|설문조사 ID를 기반으로 설문조사를 삭제하는 API|

## API 상세

### 설문조사 생성
[Path]<br>

- Post
- /survey/register

[Request]<br>
<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Required</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="4">id</td>
    <td> </td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td colspan="4">title</td>
    <td>O</td>
    <td>String</td>
    <td>설문조사 이름</td>
  </tr>
  <tr>
    <td colspan="4">description</td>
    <td>O</td>
    <td>String</td>
    <td>설문조사 설명</td>
  </tr>
  <tr>
    <td colspan="4">items</td>
    <td>O</td>
    <td>List</td>
    <td>설문 받을 항목들</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">id</td>
    <td>O</td>
    <td>Long</td>
    <td>설문조사 항목 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">name</td>
    <td>O</td>
    <td>String</td>
    <td>항목 이름</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">description</td>
    <td> </td>
    <td>String</td>
    <td>항목 설명</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">inputType</td>
    <td>O</td>
    <td>String</td>
    <td>항목 입력 형태<br>(SHORT_ANSWER, LONG_ANSWER, SINGLE_SELECT_LIST, MULTI_SELECT_LIST 중 택 1)</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">required</td>
    <td>O</td>
    <td>Boolean</td>
    <td>항목 필수 여부</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">selectOptions</td>
    <td> </td>
    <td>List</td>
    <td>선택 리스트</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">id</td>
    <td>O</td>
    <td>Long</td>
    <td>선택 옵션 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">content</td>
    <td> </td>
    <td>String</td>
    <td>선택 옵션 설명</td>
  </tr>
</table>

```
{
  "result": {
    "result_code": 0,
    "result_message": "string",
    "result_description": "string"
  },
  "body": {
    "id": 0,
    "title": "string",
    "description": "string",
    "items": [
      {
        "id": 0,
        "name": "string",
        "description": "string",
        "input_type": "SHORT_ANSWER",
        "required": true,
        "select_options": [
          {
            "id": 0,
            "content": "string"
          }
        ]
      }
    ]
  }
}
```
[Response]<br>

<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="4">id</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td colspan="4">title</td>
    <td>String</td>
    <td>설문조사 이름</td>
  </tr>
  <tr>
    <td colspan="4">description</td>
    <td>String</td>
    <td>설문조사 설명</td>
  </tr>
  <tr>
    <td colspan="4">items</td>
    <td>List</td>
    <td>설문 받을 항목들</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">id</td>
    <td>Long</td>
    <td>설문조사 항목 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">surveyId</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">name</td>
    <td>String</td>
    <td>항목 이름</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">description</td>
    <td>String</td>
    <td>항목 설명</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">inputType</td>
    <td>String</td>
    <td>항목 입력 형태<br>(SHORT_ANSWER, LONG_ANSWER, SINGLE_SELECT_LIST, MULTI_SELECT_LIST 중 택 1)</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">required</td>
    <td>Boolean</td>
    <td>항목 필수 여부</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">selectOptions</td>
    <td>List</td>
    <td>선택 리스트</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">id</td>
    <td>Long</td>
    <td>선택 옵션 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">surveyId</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">itemId</td>
    <td>Long</td>
    <td>설문조사 항목 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">content</td>
    <td>String</td>
    <td>선택 옵션 설명</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">status</td>
    <td>String</td>
    <td>등록 상태<br>(REGISTERED, UNREGISTERED 중 택 1)</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">registeredAt</td>
    <td>LocalDateTime</td>
    <td>최초생성일자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">modifiedAt</td>
    <td>LocalDateTime</td>
    <td>수정일자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">unregisteredAt</td>
    <td>LocalDateTime</td>
    <td>삭제일자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">status</td>
    <td>String</td>
    <td>등록 상태<br>(REGISTERED, UNREGISTERED 중 택 1)</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">registeredAt</td>
    <td>LocalDateTime</td>
    <td>최초생성일자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">modifiedAt</td>
    <td>LocalDateTime</td>
    <td>수정일자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">unregisteredAt</td>
    <td>LocalDateTime</td>
    <td>삭제일자</td>
  </tr>
  <tr>
    <td colspan="4">status</td>
    <td>String</td>
    <td>등록 상태<br>(REGISTERED, UNREGISTERED 중 택 1)</td>
  </tr>
  <tr>
    <td colspan="4">registeredAt</td>
    <td>LocalDateTime</td>
    <td>최초생성일자</td>
  </tr>
  <tr>
    <td colspan="4">modifiedAt</td>
    <td>LocalDateTime</td>
    <td>수정일자</td>
  </tr>
  <tr>
    <td colspan="4">unregisteredAt</td>
    <td>LocalDateTime</td>
    <td>삭제일자</td>
  </tr>
</table>

```
{
  "result": {
    "result_code": 0,
    "result_message": "string",
    "result_description": "string"
  },
  "body": {
    "id": 0,
    "title": "string",
    "description": "string",
    "items": [
      {
        "id": 0,
        "survey_id": 0,
        "name": "string",
        "description": "string",
        "input_type": "SHORT_ANSWER",
        "required": true,
        "select_options": [
          {
            "id": 0,
            "survey_id": 0,
            "item_id": 0,
            "content": "string",
            "status": "REGISTERED",
            "registered_at": "2024-12-03T13:07:38.529Z",
            "modified_at": "2024-12-03T13:07:38.529Z",
            "unregistered_at": "2024-12-03T13:07:38.529Z"
          }
        ],
        "status": "REGISTERED",
        "registered_at": "2024-12-03T13:07:38.529Z",
        "modified_at": "2024-12-03T13:07:38.529Z",
        "unregistered_at": "2024-12-03T13:07:38.529Z"
      }
    ],
    "status": "REGISTERED",
    "registered_at": "2024-12-03T13:07:38.530Z",
    "modified_at": "2024-12-03T13:07:38.530Z",
    "unregistered_at": "2024-12-03T13:07:38.530Z"
  }
}
```

### 설문조사 수정
[Path]<br>

- Post
- /survey/update

[Request]<br>
<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Required</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="4">id</td>
    <td> </td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td colspan="4">title</td>
    <td>O</td>
    <td>String</td>
    <td>설문조사 이름</td>
  </tr>
  <tr>
    <td colspan="4">description</td>
    <td>O</td>
    <td>String</td>
    <td>설문조사 설명</td>
  </tr>
  <tr>
    <td colspan="4">items</td>
    <td>O</td>
    <td>List</td>
    <td>설문 받을 항목들</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">id</td>
    <td>O</td>
    <td>Long</td>
    <td>설문조사 항목 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">name</td>
    <td>O</td>
    <td>String</td>
    <td>항목 이름</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">description</td>
    <td> </td>
    <td>String</td>
    <td>항목 설명</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">inputType</td>
    <td>O</td>
    <td>String</td>
    <td>항목 입력 형태<br>(SHORT_ANSWER, LONG_ANSWER, SINGLE_SELECT_LIST, MULTI_SELECT_LIST 중 택 1)</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">required</td>
    <td>O</td>
    <td>Boolean</td>
    <td>항목 필수 여부</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">selectOptions</td>
    <td> </td>
    <td>List</td>
    <td>선택 리스트</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">id</td>
    <td>O</td>
    <td>Long</td>
    <td>선택 옵션 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">content</td>
    <td> </td>
    <td>String</td>
    <td>선택 옵션 설명</td>
  </tr>
</table>

```
{
  "result": {
    "result_code": 0,
    "result_message": "string",
    "result_description": "string"
  },
  "body": {
    "id": 0,
    "title": "string",
    "description": "string",
    "items": [
      {
        "id": 0,
        "name": "string",
        "description": "string",
        "input_type": "SHORT_ANSWER",
        "required": true,
        "select_options": [
          {
            "id": 0,
            "content": "string"
          }
        ]
      }
    ]
  }
}
```
[Response]<br>

<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="4">id</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td colspan="4">title</td>
    <td>String</td>
    <td>설문조사 이름</td>
  </tr>
  <tr>
    <td colspan="4">description</td>
    <td>String</td>
    <td>설문조사 설명</td>
  </tr>
  <tr>
    <td colspan="4">items</td>
    <td>List</td>
    <td>설문 받을 항목들</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">id</td>
    <td>Long</td>
    <td>설문조사 항목 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">surveyId</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">name</td>
    <td>String</td>
    <td>항목 이름</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">description</td>
    <td>String</td>
    <td>항목 설명</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">inputType</td>
    <td>String</td>
    <td>항목 입력 형태<br>(SHORT_ANSWER, LONG_ANSWER, SINGLE_SELECT_LIST, MULTI_SELECT_LIST 중 택 1)</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">required</td>
    <td>Boolean</td>
    <td>항목 필수 여부</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">selectOptions</td>
    <td>List</td>
    <td>선택 리스트</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">id</td>
    <td>Long</td>
    <td>선택 옵션 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">surveyId</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">itemId</td>
    <td>Long</td>
    <td>설문조사 항목 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">content</td>
    <td>String</td>
    <td>선택 옵션 설명</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">status</td>
    <td>String</td>
    <td>등록 상태<br>(REGISTERED, UNREGISTERED 중 택 1)</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">registeredAt</td>
    <td>LocalDateTime</td>
    <td>최초생성일자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">modifiedAt</td>
    <td>LocalDateTime</td>
    <td>수정일자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">unregisteredAt</td>
    <td>LocalDateTime</td>
    <td>삭제일자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">status</td>
    <td>String</td>
    <td>등록 상태<br>(REGISTERED, UNREGISTERED 중 택 1)</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">registeredAt</td>
    <td>LocalDateTime</td>
    <td>최초생성일자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">modifiedAt</td>
    <td>LocalDateTime</td>
    <td>수정일자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">unregisteredAt</td>
    <td>LocalDateTime</td>
    <td>삭제일자</td>
  </tr>
  <tr>
    <td colspan="4">status</td>
    <td>String</td>
    <td>등록 상태<br>(REGISTERED, UNREGISTERED 중 택 1)</td>
  </tr>
  <tr>
    <td colspan="4">registeredAt</td>
    <td>LocalDateTime</td>
    <td>최초생성일자</td>
  </tr>
  <tr>
    <td colspan="4">modifiedAt</td>
    <td>LocalDateTime</td>
    <td>수정일자</td>
  </tr>
  <tr>
    <td colspan="4">unregisteredAt</td>
    <td>LocalDateTime</td>
    <td>삭제일자</td>
  </tr>
</table>

```
{
  "result": {
    "result_code": 0,
    "result_message": "string",
    "result_description": "string"
  },
  "body": {
    "id": 0,
    "title": "string",
    "description": "string",
    "items": [
      {
        "id": 0,
        "survey_id": 0,
        "name": "string",
        "description": "string",
        "input_type": "SHORT_ANSWER",
        "required": true,
        "select_options": [
          {
            "id": 0,
            "survey_id": 0,
            "item_id": 0,
            "content": "string",
            "status": "REGISTERED",
            "registered_at": "2024-12-03T13:23:32.752Z",
            "modified_at": "2024-12-03T13:23:32.752Z",
            "unregistered_at": "2024-12-03T13:23:32.752Z"
          }
        ],
        "status": "REGISTERED",
        "registered_at": "2024-12-03T13:23:32.752Z",
        "modified_at": "2024-12-03T13:23:32.752Z",
        "unregistered_at": "2024-12-03T13:23:32.752Z"
      }
    ],
    "status": "REGISTERED",
    "registered_at": "2024-12-03T13:23:32.752Z",
    "modified_at": "2024-12-03T13:23:32.752Z",
    "unregistered_at": "2024-12-03T13:23:32.752Z"
  }
}
```

### 설문조사 응답 제출
[Path]<br>

- Post
- /survey/reply
  
[Request]<br>
<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Required</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="4">id</td>
    <td>O</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td colspan="4">reply</td>
    <td> </td>
    <td>List</td>
    <td>설문조사 응답리스트</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">id</td>
    <td>O</td>
    <td>Long</td>
    <td>설문조사 응답 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">itemId</td>
    <td>O</td>
    <td>Long</td>
    <td>설문조사 항목 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">name</td>
    <td> </td>
    <td>content</td>
    <td>응답 내용</td>
  </tr>
</table>

```
{
  "result": {
    "result_code": 0,
    "result_message": "string",
    "result_description": "string"
  },
  "body": {
    "id": 0,
    "reply": [
      {
        "id": 0,
        "item_id": 0,
        "content": "string"
      }
    ]
  }
}
```
[Response]<br>

<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="4">id</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td colspan="4">reply</td>
    <td>List</td>
    <td>설문조사 응답리스트</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">id</td>
    <td>Long</td>
    <td>설문조사 응답 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">surveyId</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">itemId</td>
    <td>Long</td>
    <td>설문조사 항목 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">name</td>
    <td>content</td>
    <td>응답 내용</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">status</td>
    <td>String</td>
    <td>등록 상태<br>(REGISTERED, UNREGISTERED 중 택 1)</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">registeredAt</td>
    <td>LocalDateTime</td>
    <td>최초생성일자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">modifiedAt</td>
    <td>LocalDateTime</td>
    <td>수정일자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">unregisteredAt</td>
    <td>LocalDateTime</td>
    <td>삭제일자</td>
  </tr>
</table>

```
{
  "result": {
    "result_code": 0,
    "result_message": "string",
    "result_description": "string"
  },
  "body": {
    "id": 0,
    "reply": [
      {
        "id": 0,
        "survey_id": 0,
        "item_id": 0,
        "content": "string",
        "status": "REGISTERED",
        "registered_at": "2024-12-03T13:24:12.117Z",
        "modified_at": "2024-12-03T13:24:12.117Z",
        "unregistered_at": "2024-12-03T13:24:12.117Z"
      }
    ]
  }
}
```

### 설문조사 응답 조회
[Path]<br>

- Post
- /survey/find/replyAll

[Request]<br>

<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Required</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="4">id</td>
    <td>O</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
</table>

```
{
  "result": {
    "result_code": 0,
    "result_message": "string",
    "result_description": "string"
  },
  "body": 0
}
```
[Response]<br>

<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="4">id</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td colspan="4">reply</td>
    <td>List</td>
    <td>설문조사 응답리스트</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">id</td>
    <td>Long</td>
    <td>설문조사 응답 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">surveyId</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">itemId</td>
    <td>Long</td>
    <td>설문조사 항목 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">name</td>
    <td>content</td>
    <td>응답 내용</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">status</td>
    <td>String</td>
    <td>등록 상태<br>(REGISTERED, UNREGISTERED 중 택 1)</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">registeredAt</td>
    <td>LocalDateTime</td>
    <td>최초생성일자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">modifiedAt</td>
    <td>LocalDateTime</td>
    <td>수정일자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">unregisteredAt</td>
    <td>LocalDateTime</td>
    <td>삭제일자</td>
  </tr>
</table>

```
{
  "result": {
    "result_code": 0,
    "result_message": "string",
    "result_description": "string"
  },
  "body": {
    "id": 0,
    "reply": [
      {
        "id": 0,
        "survey_id": 0,
        "item_id": 0,
        "content": "string",
        "status": "REGISTERED",
        "registered_at": "2024-12-03T13:24:40.007Z",
        "modified_at": "2024-12-03T13:24:40.007Z",
        "unregistered_at": "2024-12-03T13:24:40.007Z"
      }
    ]
  }
}
```

### 설문조사 조회
[Path]<br>

- Post
- /survey/find

[Request]<br>

<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Required</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="4">id</td>
    <td>O</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
</table>

```
{
  "result": {
    "result_code": 0,
    "result_message": "string",
    "result_description": "string"
  },
  "body": 0
}
```
[Response]<br>

<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="4">id</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td colspan="4">title</td>
    <td>String</td>
    <td>설문조사 이름</td>
  </tr>
  <tr>
    <td colspan="4">description</td>
    <td>String</td>
    <td>설문조사 설명</td>
  </tr>
  <tr>
    <td colspan="4">items</td>
    <td>List</td>
    <td>설문 받을 항목들</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">id</td>
    <td>Long</td>
    <td>설문조사 항목 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">surveyId</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">name</td>
    <td>String</td>
    <td>항목 이름</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">description</td>
    <td>String</td>
    <td>항목 설명</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">inputType</td>
    <td>String</td>
    <td>항목 입력 형태<br>(SHORT_ANSWER, LONG_ANSWER, SINGLE_SELECT_LIST, MULTI_SELECT_LIST 중 택 1)</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">required</td>
    <td>Boolean</td>
    <td>항목 필수 여부</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">selectOptions</td>
    <td>List</td>
    <td>선택 리스트</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">id</td>
    <td>Long</td>
    <td>선택 옵션 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">surveyId</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">itemId</td>
    <td>Long</td>
    <td>설문조사 항목 식별자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">content</td>
    <td>String</td>
    <td>선택 옵션 설명</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">status</td>
    <td>String</td>
    <td>등록 상태<br>(REGISTERED, UNREGISTERED 중 택 1)</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">registeredAt</td>
    <td>LocalDateTime</td>
    <td>최초생성일자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">modifiedAt</td>
    <td>LocalDateTime</td>
    <td>수정일자</td>
  </tr>
  <tr>
    <td> </td>
    <td> </td>
    <td colspan="2">unregisteredAt</td>
    <td>LocalDateTime</td>
    <td>삭제일자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">status</td>
    <td>String</td>
    <td>등록 상태<br>(REGISTERED, UNREGISTERED 중 택 1)</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">registeredAt</td>
    <td>LocalDateTime</td>
    <td>최초생성일자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">modifiedAt</td>
    <td>LocalDateTime</td>
    <td>수정일자</td>
  </tr>
  <tr>
    <td> </td>
    <td colspan="3">unregisteredAt</td>
    <td>LocalDateTime</td>
    <td>삭제일자</td>
  </tr>
  <tr>
    <td colspan="4">status</td>
    <td>String</td>
    <td>등록 상태<br>(REGISTERED, UNREGISTERED 중 택 1)</td>
  </tr>
  <tr>
    <td colspan="4">registeredAt</td>
    <td>LocalDateTime</td>
    <td>최초생성일자</td>
  </tr>
  <tr>
    <td colspan="4">modifiedAt</td>
    <td>LocalDateTime</td>
    <td>수정일자</td>
  </tr>
  <tr>
    <td colspan="4">unregisteredAt</td>
    <td>LocalDateTime</td>
    <td>삭제일자</td>
  </tr>
</table>

```
{
  "result": {
    "result_code": 0,
    "result_message": "string",
    "result_description": "string"
  },
  "body": {
    "id": 0,
    "title": "string",
    "description": "string",
    "items": [
      {
        "id": 0,
        "survey_id": 0,
        "name": "string",
        "description": "string",
        "input_type": "SHORT_ANSWER",
        "required": true,
        "select_options": [
          {
            "id": 0,
            "survey_id": 0,
            "item_id": 0,
            "content": "string",
            "status": "REGISTERED",
            "registered_at": "2024-12-03T13:24:57.892Z",
            "modified_at": "2024-12-03T13:24:57.893Z",
            "unregistered_at": "2024-12-03T13:24:57.893Z"
          }
        ],
        "status": "REGISTERED",
        "registered_at": "2024-12-03T13:24:57.893Z",
        "modified_at": "2024-12-03T13:24:57.893Z",
        "unregistered_at": "2024-12-03T13:24:57.893Z"
      }
    ],
    "status": "REGISTERED",
    "registered_at": "2024-12-03T13:24:57.893Z",
    "modified_at": "2024-12-03T13:24:57.893Z",
    "unregistered_at": "2024-12-03T13:24:57.893Z"
  }
}
```

### 설문조사 전체 조회
[Path]<br>

- Get
- /survey/find/baseAll

[Request]<br>

<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="6">No parameters</td>
  </tr>
</table>

```
No parameters
```
[Response]<br>

<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="4">id</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td colspan="4">title</td>
    <td>String</td>
    <td>설문조사 이름</td>
  </tr>
  <tr>
    <td colspan="4">description</td>
    <td>String</td>
    <td>설문조사 설명</td>
  </tr>
  <tr>
    <td colspan="4">status</td>
    <td>String</td>
    <td>등록 상태<br>(REGISTERED, UNREGISTERED 중 택 1)</td>
  </tr>
  <tr>
    <td colspan="4">registeredAt</td>
    <td>LocalDateTime</td>
    <td>최초생성일자</td>
  </tr>
  <tr>
    <td colspan="4">modifiedAt</td>
    <td>LocalDateTime</td>
    <td>수정일자</td>
  </tr>
  <tr>
    <td colspan="4">unregisteredAt</td>
    <td>LocalDateTime</td>
    <td>삭제일자</td>
  </tr>
</table>

```
{
  "result": {
    "result_code": 0,
    "result_message": "string",
    "result_description": "string"
  },
  "body": [
    {
      "id": 0,
      "title": "string",
      "description": "string",
      "status": "REGISTERED",
      "registered_at": "2024-12-03T13:25:14.631Z",
      "modified_at": "2024-12-03T13:25:14.631Z",
      "unregistered_at": "2024-12-03T13:25:14.631Z"
    }
  ]
}
```

### 설문조사 삭제
[Path]<br>

- Post
- /survey/delete

[Request]<br>

<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Required</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="4">id</td>
    <td>O</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
</table>

```
{
  "result": {
    "result_code": 0,
    "result_message": "string",
    "result_description": "string"
  },
  "body": 0
}
```
[Response]<br>

<table>
  <tr>
    <th colspan="4">Name</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td colspan="4">id</td>
    <td>Long</td>
    <td>설문조사 식별자</td>
  </tr>
  <tr>
    <td colspan="4">title</td>
    <td>String</td>
    <td>설문조사 이름</td>
  </tr>
  <tr>
    <td colspan="4">description</td>
    <td>String</td>
    <td>설문조사 설명</td>
  </tr>
  <tr>
    <td colspan="4">status</td>
    <td>String</td>
    <td>등록 상태<br>(REGISTERED, UNREGISTERED 중 택 1)</td>
  </tr>
  <tr>
    <td colspan="4">registeredAt</td>
    <td>LocalDateTime</td>
    <td>최초생성일자</td>
  </tr>
  <tr>
    <td colspan="4">modifiedAt</td>
    <td>LocalDateTime</td>
    <td>수정일자</td>
  </tr>
  <tr>
    <td colspan="4">unregisteredAt</td>
    <td>LocalDateTime</td>
    <td>삭제일자</td>
  </tr>
</table>

```
{
  "result": {
    "result_code": 0,
    "result_message": "string",
    "result_description": "string"
  },
  "body": {
    "id": 0,
    "title": "string",
    "description": "string",
    "status": "REGISTERED",
    "registered_at": "2024-12-03T13:25:50.301Z",
    "modified_at": "2024-12-03T13:25:50.301Z",
    "unregistered_at": "2024-12-03T13:25:50.301Z"
  }
}
```
---------------------------------------
# 이너써클 BE 온보딩 프로젝트

## 온보딩 프로젝트의 목적

- 공통된 내용과 기술스택을 이용한 기술 경험 수준 평가
- 최대한 과거에 경험 해보시지 못한 주제를 선정하여 기술적으로 챌린지 하실 수 있게끔 구성
- 점수를 매기거나 합격과 불합격을 구분하는 목적은 아님.
- 서로가 서로에게 도움 줄 수 있는 각자의 강점을 파악하기 위하여 진행
  - 꼼꼼한 요구사항 분석과 문서화
  - 새로운 기술적 접근 방식
  - 안정적인 아키텍처 구성

## Introduction

- “설문조사 서비스"를 구현하려고 합니다.
- “온보딩 프로젝트 기능 요구사항"을 구현해 주시기 바랍니다.
- 온보딩 프로젝트 기능 요구 사항 및 기술 요구사항이 충족되지 않은 결과물은 코드레벨 평가를 진행하지 않습니다.
- 아래의 “코드레벨 평가항목"으로 코드를 평가합니다.
- “설문조사 서비스"의 API 명세를 함께 제출해주세요.
- 우대사항은 직접 구현하지 않더라도 README에 적용 방법 등을 구체적으로 명시해주시는 것으로 대체 할 수 있습니다.

## 온보딩 프로젝트 기능 요구사항

### 개요

- “설문조사 서비스”는 설문조사 양식을 만들고, 만들어진 양식을 기반으로 응답을 받을 수 있는 서비스입니다. (e.g. Google Forms, Tally, Typeform)
- 설문조사 양식은 [설문조사 이름], [설문조사 설명], [설문 받을 항목]의 구성으로 이루어져있습니다.
- [설문 받을 항목]은 [항목 이름], [항목 설명], [항목 입력 형태], [항목 필수 여부]의 구성으로 이루어져있습니다.
- [항목 입력 형태]는 [단답형], [장문형], [단일 선택 리스트], [다중 선택 리스트]의 구성으로 이루어져있습니다.


### 1. 설문조사 생성 API

- 요청 값에는 [설문조사 이름], [설문조사 설명], [설문 받을 항목]이 포함됩니다.
- [설문 받을 항목]은 [항목 이름], [항목 설명], [항목 입력 형태], [항목 필수 여부]의 구성으로 이루어져있습니다.
- [항목 입력 형태]는 [단답형], [장문형], [단일 선택 리스트], [다중 선택 리스트]의 구성으로 이루어져있습니다.
    - [단일 선택 리스트], [다중 선택 리스트]의 경우 선택 할 수 있는 후보를 요청 값에 포함하여야 합니다.


### 2. 설문조사 수정 API

- 요청 값에는 [설문조사 이름], [설문조사 설명], [설문 받을 항목]이 포함됩니다.
- [설문 받을 항목]은 [항목 이름], [항목 설명], [항목 입력 형태], [항목 필수 여부]의 구성으로 이루어져있습니다.
- [항목 입력 형태]는 [단답형], [장문형], [단일 선택 리스트], [다중 선택 리스트]의 구성으로 이루어져있습니다.
    - [단일 선택 리스트], [다중 선택 리스트]의 경우 선택 할 수 있는 후보를 요청 값에 포함하여야 합니다.
- [설문 받을 항목]이 추가/변경/삭제 되더라도 기존 응답은 유지되어야 합니다.


### 3. 설문조사 응답 제출 API

- 요청 값에는 [설문 받을 항목]에 대응되는 응답 값이 포함됩니다.
- 응답 값은 설문조사의 [설문 받을 항목]과 일치해야만 응답 할 수 있습니다.


### 4. 설문조사 응답 조회 API

- 요청 값에는 [설문조사 식별자]가 포함됩니다.
- 해당 설문조사의 전체 응답을 조회합니다.
- **(Advanced)** 설문 응답 항목의 이름과 응답 값을 기반으로 검색 할 수 있습니다.

<br/>

> 💡 주어진 요구사항 이외의 추가 기능 구현에 대한 제약은 없으며, 새롭게 구현한 기능이 있을 경우 README 파일에 기재 해주세요.

<br/>

## 기술 요구 사항

- JAVA 11 이상 또는 Kotlin 사용
- Spring Boot 사용
- Gradle 기반의 프로젝트
- 온보딩 프로젝트 기능 요구사항은 서버(백엔드)에서 구현/처리
- 구현을 보여줄 수 있는 화면(프론트엔드)은 구현 금지
- DB는 인메모리 RDBMS(예: h2)를 사용하며 DB 컨트롤은 JPA로 구현. (NoSQL 사용 X)
- API의 HTTP Method는 자유롭게 선택해주세요.
- 에러 응답, 에러 코드는 자유롭게 정의해주세요.
- 외부 라이브러리 및 오픈소스 사용 가능 (단, README 파일에 사용한 오픈 소스와 사용 목적을 명확히 명시해 주세요.)

## 코드레벨 평가 항목

온보딩 프로젝트는 다음 내용을 고려하여 평가 하게 됩니다.

- 프로젝트 구성 방법 및 관련된 시스템 아키텍처 설계 방법이 적절한가?
- 작성한 애플리케이션 코드의 가독성이 좋고 의도가 명확한가?
    - e.g. 불필요한(사용되지) 않는 코드의 존재 여부, 일정한 코드 컨벤션 등
- 작성한 테스트 코드는 적절한 범위의 테스트를 수행하고 있는가?
    - e.g. 유닛/통합 테스트 등
- Spring Boot의 기능을 적절히 사용하고 있는가?
- 예외 처리(Exception Handling)은 적절히 수행하고 있는가?

## 우대사항

- 프로젝트 구성 추가 요건: 멀티 모듈 구성 및 모듈간 의존성 제약
- Back-end 추가 요건
    - 트래픽이 많고, 저장되어 있는 데이터가 많음을 염두에 둔 구현
    - 다수의 서버, 인스턴스에서 동작할 수 있음을 염두에 둔 구현
    - 동시성 이슈가 발생할 수 있는 부분을 염두에 둔 구현
 
## 온보딩 프로젝트 제출 방식

### 소스코드

- 본 Repository에 main 브랜치를 포크하여 작업을 시작합니다.
- SpringBoot 프로젝트를 신규로 설정하고, 개인별로 main 브랜치에 PR을 공개적으로 먼저 작성한 후에 작업을 시작합니다.
  - 이때 PR에는 WIP 레이블을 붙여서 작업 중임을 알게 해주세요.
  - 코드를 마무리해서 리뷰받을 준비가 되면 WIP 레이블을 제거하고, Needs Review 레이블을 추가해주세요.
  - 피드백을 받은 후 추가 작업을 진행할 때는 WIP 레이블을 다시 추가하고 Needs Review 레이블을 제거해주세요.
- 최소 기능 단위로 완성할 때 마다 커밋합니다.

### 기능 점검을 위한 빌드 결과물

빌드 결과물을 Executable jar 형태로 만들어 위 Branch에 함께 업로드 하시고, README에 다운로드 링크 정보를 넣어주시기 바랍니다. GitHub의 용량 문제로 업로드가 안되는 경우 다른 곳(개인 구글 드라이브 등)에 업로드 한 후 해당 다운로드 링크 정보를 README에 넣어주셔도 됩니다.

해당 파일을 다운로드 및 실행(e.g. java -jar project.jar)하여 요구 사항 기능 검증을 진행하게 됩니다. 해당 파일을 다운로드할 수 없거나 실행 시 에러가 발생하는 경우에는 기능 점검을 진행하지 않습니다. 온보딩 프로젝트 제출 전 해당 실행 파일 다운로드 및 정상 동작 여부를 체크해 주시기 바랍니다.

// 请求参数平铺作为函数参数，一旦参数改变将导致过多的修改，同时参数过多导致单测得组合变多
async function postUser(userName, age, gender, birthday) {
  const response = fetch('https://example.com/answer', {
    userName,
    age,
    gender,
    birthday
  })
  return await response.json();
}

import React from "react";

// 상위컴포넌트에서 데이터를 전달받아서 출력 컴포넌트
function Details({menu}){

    if(!menu) {
        return (
            <div>선택된 메뉴거 없습니다.</div>
        )
    }

    return (
        <div>
            <h3>상품 번호 : {menu.mno}</h3>
            <h3>상품 이름 : {menu.name}</h3>
            <h3>상품 이름 : {menu.price}</h3>
        </div>
    ) 

}

export default Details
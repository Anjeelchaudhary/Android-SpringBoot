import React, { useEffect, useState } from 'react'
import axious from "axios"

const Home = () => {
    const [useApi, setUseApi] = useState([])

    useEffect(() => {
        axious.get("https://jsonplaceholder.typicode.com/users")
            .then((Response => {
                // console.log(Response.data)
                setUseApi(Response.data)
            }))
            
    },[useApi])
    return (
        <div>
            <div >Its Home</div>
            {
                useApi.map((item)=>(
                    <div className='flex justify-around items-centre'>
                        <h1>{item.name}</h1>
                        <h1>{item.username}</h1>
                        <h1>{item.email}</h1>
                    </div>
                ))
            }
        </div>
    )
}

export default Home


async function fetchData(url){

    try{
        const response = await fetch(url);
        if(!response.ok){
            throw new Error('response not ok');
        }

        const data = await response.json();
        return data;

    }catch (err) {
        console.log(err)
    }
}
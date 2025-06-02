const Movie = ({ title, length, releaseYear, titlePicture }) => {
    return (
        <div className="p-4 rounded-2xl shadow-md bg-white max-w-sm">
            <img src={titlePicture}/>
            <h2 className="text-xl font-bold mb-2">{title}</h2>
            <p className="text-gray-700">Length: {length} minutes</p>
            <p className="text-gray-700">Release Year: {releaseYear}</p>
        </div>
    );
};
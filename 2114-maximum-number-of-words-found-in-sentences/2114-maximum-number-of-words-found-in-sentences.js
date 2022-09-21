
const mostWordsFound = (sentences) => sentences.reduce((num, el) => Math.max(num, el.split(' ').length), 0);